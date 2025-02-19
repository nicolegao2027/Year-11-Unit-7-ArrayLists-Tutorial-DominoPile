import java.util.ArrayList;

public class DominoPile{
    private ArrayList<Domino> pile;
    public DominoPile(){
        pile=new ArrayList<>();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        for(int i=0;i<=6;i++){
            for(int j=i;j<=6;j++){
                pile.add(new Domino(i,j));
            }
        }
    }
    public void shuffle() {
        int n=pile.size();
        ArrayList <Domino> newPile=new ArrayList<>(n);
        boolean[] added = new boolean[n];
        for(int i=0;i<n;i++){
            int randomIndex=(int)(Math.random()*n);
            boolean a=false;
            if (!added[randomIndex]) {
                newPile.add(pile.get(randomIndex));
                added[randomIndex] = true;
            }
        }
    }
}

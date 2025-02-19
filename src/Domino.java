public class Domino{
    private int top;
    private int bottom;
    public Domino(){
        top=0;
        bottom=0;
    }
    public Domino(int t, int b){
        top=t;
        bottom=b;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int t){
        top=t;
    }
    public void setBottom(int b){
        bottom=b;
    }
    public String toString(){
        return top+"/"+bottom;
    }
    public void flip(){
        int a=top;
        top=bottom;
        bottom=a;
    }
    public void settle(){
        if(top>bottom){
            this.flip();
        }
    }
    public int compareTo(Domino other){
        Domino a=this;
        a.settle();
        Domino b=other;
        b.settle();
        if(a.top<b.top){
            return -1;
        }
        if(a.top>b.top){
            return 1;
        }
        if(a.top==b.top){
            if(a.bottom<b.bottom){
                return -1;
            }
            if(a.bottom>b.bottom){
                return 1;
            }
            return 0;
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        int a=this.top+this.bottom;
        int b=other.top+other.bottom;
        if(a<b){
            return -1;
        }
        if(a>b){
            return 1;
        }
        if(a==b){
            return 0;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        if(this.top==other.top||this.top==other.bottom||this.bottom==other.top||this.bottom==other.bottom){
            return true;
        }
        return false;
    }
}

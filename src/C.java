class C extends B {
    C(double w,double e,int d){
        super.z=d;
        super.x=w;
        super.y=e;
    }
    void met2(){
        System.out.println("super="+super.x*super.y*super.z);
    }
}

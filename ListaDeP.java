void main(){

    String p = "PAR";
    String im = "IMPAR";

    for(int i = 1;i<=50;i++){
        if (i % 2 == 0){
            System.out.println(i + " = " + p);
        }else{
            System.out.println(i + " = " + im);
        }
    }
}
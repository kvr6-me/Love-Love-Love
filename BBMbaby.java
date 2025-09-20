public class BBMbaby {
    public static void main(String [] args){
        for ( int i=1; i<=2; i++) {
            for ( int j=i; j<=2; j++)
                System.out.print(" * ");
            for (int s=2; s<2*i; s++) {
                System.out.print("   ");
            }
            for (int h=i; h<=2; h++) {
                System.out.print(" * ");
            }
           if(i%2!=0) {
               System.out.print(" * ");
           }
            for (int s=2; s<2*i; s++) {
                System.out.print("   ");
            }
            for ( int j=i; j<=2; j++) {
                System.out.print(" * ");
            }
System.out.println();
        }
for (int i=1; i<=4; i++){

    for ( int j=1; j<i; j++){
    System.out.print(" * ");
}
    for ( int s=i; s<=3; s++){
        System.out.print("   ");
    }
for ( int s=i; s<=4; s++){
    System.out.print("   ");
}
for ( int j=1; j<i; j++){
    System.out.print(" * ");
}
    System.out.println();
}
for ( int i=1; i<=7; i++) {
    System.out.print(" * ");
}
        System.out.println();}}

// very dangerous!
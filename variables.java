class variable{
    public static void main(String a[]){
        // sum of two numbers
        int firstNum=10;
        int secondNum=30;
        int sum=firstNum+secondNum;
        System.out.println(sum);
        // sum of two strings
        String fName="dhiraj";
        String sName="Tiwari";
        String fullName=fName + sName;
        System.out.println(fullName);
        //reAssing varialbles
        int myNum=30;
        myNum=50;  //take current value
        System.out.println(myNum);
        //final variable
        final int myNum2=30;
        // myNum2=50;  //error due to use final varialble it means constant
        System.out.println(myNum2);

        //calculate area of rectangle
        int length=4;
        int widrth=5;
        int area=length*widrth;
        System.out.println("Area of Reactangle is : "+area);
    }
}
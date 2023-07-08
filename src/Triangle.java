public class Triangle {
    int a;
    int b;
    int c;
    public void Area() {
        int p=(a+b+c)/2;
        int s=p*(p-a)*(p-b)*(p-c);
        System.out.println(Math.sqrt(s));
    }
}

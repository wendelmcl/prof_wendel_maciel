class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro n�mero: ");
        double numero1= scanner.nextDouble();
        
        System.out.print("Digite o segundo n�mero: ");
        double numero2= scanner.nextDouble();
        
        System.out.print("Digite o terceiro n�mero: ");
        double numero3= scanner.nextDouble();
        
        double maiorNumero= Math.max(Math.max(numero1, numero2), numero3)
        
        System.out.println("O maior n�mero �: "+ maiorNumero);
        
        scanner.close();
       }
    }
}

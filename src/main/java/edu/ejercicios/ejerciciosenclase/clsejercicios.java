package edu.ejercicios.ejerciciosenclase;

public class clsejercicios {
    //Calcular área del círculo.
    public void area(){
        double radio = 10;
        double area = calculararea(radio);
        System.out.println("1.AREA DEL CÍRCULO.");
        System.out.println("El area es: " + area);
    }
    public static double calculararea(double radio){
        final double PI = 3.1416;
        return PI*radio*radio;
    }

    //Calcular circunferencia de un círculo.
    public void circunferencia(){
        double radio = 10;
        double circunferencia = calcularcircunferencia(radio);
        System.out.println("2.CIRCUNFERENCIA DEL CÍRCULO.");
        System.out.println("La circunferencia es: " + circunferencia);
    }
    public static double calcularcircunferencia(double radio){
        final double PI = 3.1416;
        return 2*PI*radio;
    }

    //Calcular volumen de un cubo.
    public void volumen(){
        double longitudlado = 10;
        double volumen = calcularvolumen(longitudlado);
        System.out.println("3.VOLUMEN DE UN CUBO.");
        System.out.println("El volumen del cubo es: " + volumen);
    }
    public static double calcularvolumen(double longitudlado){
        return longitudlado*longitudlado*longitudlado;
    }

    //Área de una piramide cuadrada.
public void areapiramide(){
        double base = 10;
        double altura = 20;
        double areapiramide = calcularareapiramide(base, altura);
        System.out.println("4.ÁREA DE UNA PIRÁMIDE CUADRADA.");
        System.out.println("El área de la pirámide es: " + areapiramide);
    }

    public static double calcularareapiramide(double base, double altura){
        return (base*altura)/2;
    }

    //Volumen de una piramide cuadrada.
    public void volumenpiramide(){
        double base = 10;
        double altura = 20;
        double volumenpiramide = calcularvolumenpiramide(base, altura);
        System.out.println("5.VOLUMEN DE UNA PIRÁMIDE CUADRADA.");
        System.out.println("El volumen de la pirámide es: " + volumenpiramide);
    }

    public static double calcularvolumenpiramide(double base, double altura){
        return (base*altura)/3;
    }

    //Calcular área de un triángulo.
    public void areatriangulo(){
        double base = 10;
        double altura = 20;
        double areatriangulo = calcularareatriangulo(base, altura);
        System.out.println("6.ÁREA DE UN TRIÁNGULO.");
        System.out.println("El área del triángulo es: " + areatriangulo);
    }

    public static double calcularareatriangulo(double base, double altura){
        return (base*altura)/2;
    }

    //Volumen de un Prisma.
    public void volumenprisma(){
        double base = 10;
        double altura = 20;
        double volumenprisma = calcularvolumenprisma(base, altura);
        System.out.println("7.VOLUMEN DE UN PRISMA.");
        System.out.println("El volumen del prisma es: " + volumenprisma);
    }

    public static double calcularvolumenprisma(double base, double altura){
        return (base*altura);
    }

    //Área de un paralelogramo.
    public void areaparalelogramo(){
        double base = 10;
        double altura = 20;
        double areaparallelogramo = calcularareaparalelogramo(base, altura);
        System.out.println("8.ÁREA DE UN PARALELOGRAMO.");
        System.out.println("El área del paralelogramo es: " + areaparallelogramo);
    }

    public static double calcularareaparalelogramo(double base, double altura){
        return (base*altura);
    }

    //Volumen de un cilindro.
    public void volumencilindro(){
        double radio = 80;
        double altura = 50;
        double volumencilindro = calcularvolumencilindro(radio, altura);
        System.out.println("9.VOLUMEN DE UN CILINDRO.");
        System.out.println("El volumen del cilindro es: " + volumencilindro);
    }

    public static double calcularvolumencilindro(double radio, double altura){
        final double PI = 3.1416;
        return PI*radio*radio*altura;
    }

    //Área de una esfera.
    public void areaesfera(){
        double radio = 100;
        double areaesfera = calcularareaesfera(radio);
        System.out.println("10.ÁREA DE UNA ESFERA.");
        System.out.println("El área de la esfera es: " + areaesfera);
    }

    public static double calcularareaesfera(double radio){
        final double PI = 3.1416;
        return 4*PI*radio*radio;
    }
}

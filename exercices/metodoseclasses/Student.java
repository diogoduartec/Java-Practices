package exercicios.metodoseclasses;

public class Student {
    private String name = "Aluno";
    private double[] grade = new double[]{0,0,0,0};
    private int age = 0;

    /*Modificadores de acesso*/
    public void setName(String name){
        this.name = name;
    }
    public void setGrade(double... grade){
        this.grade = grade;
    }
    public void setAge(int age){
        if(age<0) System.out.println("idade não pode ser menor que 0");
        else this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double[] getGrade(){
        return this.grade;
    }
    /*-----------------------------*/

    public void print(){
        System.out.println("Aluno: "+this.name);
        System.out.println("Idade: "+this.age);
        System.out.print("Notas:");
        for(double x: this.grade){
            System.out.print(" "+x);
        }
    }

    public void average(){
        double sum = 0;
        for(double x: this.grade) {
            sum += x;
        }
        System.out.println("\nA média é: "+sum/grade.length);
        if(sum/grade.length>=6) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Main {
  public static void main(String[] args) throws ParseException {

      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

      System.out.println("@@@@ Iniciando os trabalhos do restaurante @@@");


      Cozinha cozMin = new Cozinha("Mineira", 14, 20, "Feijoada" );

      Ingrediente ingrediente = new Ingrediente("Feijão", formato.parse("25/12/2021 22:00:00"));
      cozMin.ingredientes.add(ingrediente);

      Ingrediente ingrediente1 = new Ingrediente("Farinha", formato.parse("25/12/2021 22:00:00"));
      cozMin.ingredientes.add(ingrediente1);

      Ingrediente ingrediente2 = new Ingrediente("Arroz", formato.parse("30/12/2021 22:00:00") );
      cozMin.ingredientes.add(ingrediente2);

      Ingrediente ingrediente3 = new Ingrediente("Carne de Porco", formato.parse("25/12/2021 22:00:00"));
      cozMin.ingredientes.add(ingrediente3);

      Ingrediente ingrediente4 = new Ingrediente("Linguiça", formato.parse("25/12/2021 22:00:00"));
      cozMin.ingredientes.add(ingrediente4);

      Funcionario funcionario1 = new Funcionario("Pedro", "Cozinheiro");
      cozMin.funcionarios.add(funcionario1);

      Funcionario funcionario2 = new Funcionario("Carla", "Chefe de Cozinha");
      cozMin.funcionarios.add(funcionario2);

      Funcionario funcionario3 = new Funcionario("Junior", "Auxiliar de Cozinha");
      cozMin.funcionarios.add(funcionario3);

      Funcionario funcionario4 = new Funcionario("Joana", "Auxiliar de Cozinha");
      cozMin.funcionarios.add(funcionario4);

      System.out.println("\n @@@ Cozinha: "+cozMin.getTipo() +" @@@");

      System.out.println("---- Ingredientes ----");
      Iterator<Ingrediente> iteraIngredientes = cozMin.ingredientes.iterator();

      while (iteraIngredientes.hasNext()){
          System.out.println("Disponível: " + iteraIngredientes.next().getNome());

      }

      System.out.println("---- Funcionários ----");
      Iterator<Funcionario> iteraFuncionarios = cozMin.funcionarios.iterator();

      while (iteraFuncionarios.hasNext()){
          System.out.println("Trabalhando " + iteraFuncionarios.next().getNome());

      }


      Cozinha cozChi = new Cozinha("Chinesa", 10, 21, "Yakissoba");

      Ingrediente ingrediente5 = new Ingrediente("Champignon", formato.parse("31/12/2022 22:00:00"));
      cozChi.ingredientes.add(ingrediente5);

      Ingrediente ingrediente6 = new Ingrediente("Brócolis", formato.parse("25/12/2022 22:00:00"));
      cozChi.ingredientes.add(ingrediente6);

      Ingrediente ingrediente7 = new Ingrediente("Macarrão", formato.parse("30/12/2022 22:00:00"));
      cozChi.ingredientes.add(ingrediente7);

      Ingrediente ingrediente8 = new Ingrediente("Carne", formato.parse("25/12/2022 22:00:00"));
      cozChi.ingredientes.add(ingrediente8);

      Funcionario funcionario5 = new Funcionario("Maria", "Cozinheiro");
      cozChi.funcionarios.add(funcionario5);

      Funcionario funcionario6 = new Funcionario("Daniele", "Chefe de Cozinha");
      cozChi.funcionarios.add(funcionario6);

      Funcionario funcionario7 = new Funcionario("Manoel", "Auxiliar de Cozinha");
      cozChi.funcionarios.add(funcionario7);

      System.out.println("\n @@@ Cozinha: "+cozChi.getTipo() +" @@@");

      System.out.println("---- Ingredientes ----");
      iteraIngredientes = cozChi.ingredientes.iterator();

      while (iteraIngredientes.hasNext()){
          System.out.println("Disponível: " + iteraIngredientes.next().getNome());

      }

      System.out.println("---- Funcionários ----");
      iteraFuncionarios = cozChi.funcionarios.iterator();

      while (iteraFuncionarios.hasNext()){
          System.out.println("Trabalhando " + iteraFuncionarios.next().getNome());

      }


      Cozinha cozIta = new Cozinha("Italiana", 10, 21, "Yakissoba");
      //(Champignon, Brócolis, Macarrão , Carne )
      Ingrediente ingrediente9 = new Ingrediente("Molho", formato.parse("31/12/2022 22:00:00"));
      cozIta.ingredientes.add(ingrediente9);

      Ingrediente ingrediente10 = new Ingrediente("Macarrão", formato.parse("25/12/2022 22:00:00"));
      cozIta.ingredientes.add(ingrediente10);

      Ingrediente ingrediente11 = new Ingrediente("Carne", formato.parse("30/12/2022 22:00:00"));
      cozIta.ingredientes.add(ingrediente11);

      Funcionario funcionario8 = new Funcionario("João", "Cozinheiro");
      cozIta.funcionarios.add(funcionario8);

      Funcionario funcionario9 = new Funcionario("Penha", "Auxiliar de Cozinha");
      cozIta.funcionarios.add(funcionario9);

      System.out.println("\n @@@ Cozinha: "+cozIta.getTipo() +" @@@");

      System.out.println("---- Ingredientes ----");
      iteraIngredientes = cozIta.ingredientes.iterator();

      while (iteraIngredientes.hasNext()){
          System.out.println("Disponível: " + iteraIngredientes.next().getNome());

      }

      System.out.println("---- Funcionários ----");
      iteraFuncionarios = cozIta.funcionarios.iterator();

      while (iteraFuncionarios.hasNext()){
          System.out.println("Trabalhando " + iteraFuncionarios.next().getNome());

      }




  }
}
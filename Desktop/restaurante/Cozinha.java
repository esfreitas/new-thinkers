import java.util.ArrayList;
import java.util.List;

public class Cozinha{

  private int numeroPratos;
  private String tipo;
  private int numeroCozinheiros;
  private int tempoDePreparo;
  private int horaAbertura;
  private int horaFechamento;
  private String pratoPrincipal;

  public Cozinha(String tipo, int horaAbertura, int horaFechamento, String pratoPrincipal){
    this.tipo = tipo;
    this.horaAbertura = horaAbertura;
    this.horaFechamento = horaFechamento;
    this.pratoPrincipal = pratoPrincipal;

  }

  List<Ingrediente> ingredientes = new ArrayList<>();
  List<Funcionario> funcionarios = new ArrayList<>();

  
  void preparaPratos(){
    System.out.println("Preparando pratos");
  }

  void lavarLouca(){
    System.out.println("Lavando louças");
  }

  void servirPratos(){
    System.out.println("Servindo pratos");
  }

  void receberPedido(){
    System.out.println("Recendo o pedido");
  }

  

  public int getNumeroPratos(){
    return numeroPratos;
  }

  public void setNumeroPratos(int numeroPratos){
    this.numeroPratos = numeroPratos;
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  
  public int getNumeroCozinheiros(){
    return numeroCozinheiros;
  }

  public void setNumeroCozinheiros(int numeroCozinheiros){
    this.numeroCozinheiros = numeroCozinheiros;
  }

  public int getTempoDePreparo(){
    return tempoDePreparo;
  }

  public void setTempoDePreparo( int tempoDePreparo){
    this.tempoDePreparo = tempoDePreparo;
  }

  public int getHoraAbertura(){
    return horaAbertura;
  }

  public void setHoraAbertura(int horaAbertura){
    this.horaAbertura = horaAbertura;
  }

  public int geHoraFechamento(){
    return horaFechamento;
  }

  public void setHoraFechamento(int horaFechamento){
    this.horaFechamento = horaFechamento;
  }

  public String getPratoPrincipal(){ return pratoPrincipal;}

  public void setPratoPrincipal(String pratoPrincipal){
    this.pratoPrincipal = pratoPrincipal;
  }

  public void setIngredientes(Ingrediente ingrediente){
    this.ingredientes.set(0 , ingrediente);
  }





}



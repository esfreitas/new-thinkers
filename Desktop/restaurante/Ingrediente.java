import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ingrediente{
  private String nome;
  private Date dataDeValidade;

  public Ingrediente(String nome, Date dataDeValidade){
    this.nome = nome;
    this.dataDeValidade = dataDeValidade;
  }

  public String getNome(){
    return nome;
  }

  
  public Date getDataDeValidade(){
    return dataDeValidade;
  }




}
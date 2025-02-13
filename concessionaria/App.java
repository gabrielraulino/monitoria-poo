
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Concessionaria c = new Concessionaria();
    Scanner sc = new Scanner(System.in);
    OUTER: while (true) {
      String entry = sc.nextLine();
      System.out.println("$" + entry);
      String ui[] = entry.split(" ");
      switch (ui[0]) {
        case "end" -> {
          sc.close();
          break OUTER;
        }
        case "addMoto" -> c.addVeiculo(
            new Moto(ui[1], ui[2], Integer.parseInt(ui[3]), Double.parseDouble(ui[4]), Integer.parseInt(ui[5])));
        case "addCaminhao" -> c.addVeiculo(
            new Caminhao(ui[1], ui[2], Integer.parseInt(ui[3]), Double.parseDouble(ui[4]), Integer.parseInt(ui[5])));
        case "addCarro" ->
          c.addVeiculo(new Carro(ui[1], ui[2], Integer.parseInt(ui[3]), Double.parseDouble(ui[4]), ui[5]));
        case "addGerente" -> c.addGerente(new Gerente(ui[1]));
        case "addVendedor" -> c.addVendedor(Integer.parseInt(ui[1]), new Vendedor(ui[2]));
        case "realizarVenda" -> {
          if (ui.length < 4) {
            c.realizaVenda(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
          } else {
            c.realizaVenda(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]), Integer.parseInt(ui[3]));
          }
        }
        case "showGerentes" -> c.showGerentes();
        case "showVendedores" -> c.showVendedores(Integer.parseInt(ui[1]));
        case "showVeiculos" -> c.showVeiculos();
        case "folha" -> System.out.println("Total em comissoes: " + c.folha());
        default -> System.out.println("comando invalido");
      }
    }
  }
}

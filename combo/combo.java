package combo;

public class combo {
	    private Sanduiche sanduiche;
	    private Sobremesa sobremesa;
	    private Bebida bebida;

	    public void CriarCombo(int tipo) {
	        switch (tipo) {
	            case 1:
	                // Combo Master
	                this.sanduiche = new Sanduiche("Big Burguer");
	                this.sobremesa = new Sobremesa("Sundae");
	                this.bebida = new Bebida("Refrigerante");
	                break;
	            case 2:
	                // Super Combo
	                this.sanduiche = new Sanduiche("Chicken Burguer");
	                this.sobremesa = new Sobremesa("Torta de Maçã");
	                this.bebida = new Bebida("Suco Natural");
	                break;
	            default:
	                System.out.println("Opção inválida!");
	                break;
	        }
	    }

	    @Override
	    public String toString() {
	        if (sanduiche != null && sobremesa != null && bebida != null) {
	            return "Seu combo inclui: " + sanduiche + ", " + sobremesa + ", " + bebida;
	        } else {
	            return "Nenhum combo selecionado.";
	        }
	    }
	}


}


public class Iphone extends AparelhoTelefonico implements INavegadorNaInternet, IReprodutorMusical {

	private String versao;

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	// Implementações da interface INavegadorNaInternet
	@Override
	public void tocar() {
		System.out.println("Tocando Musica...");

	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica...");

	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica: " + musica + " selecionada!");

	}

	// Implementações da interface IReprodutorMusical
	@Override
	public void exibirPagina(String url) {
		System.out.println("Página Carregada...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova Aba Adicionada...");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página...     Atualizado!");
	}

}

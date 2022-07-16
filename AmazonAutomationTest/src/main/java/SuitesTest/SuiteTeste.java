package SuitesTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Test.AcessarSite;
import Test.PesquisarProduto;
import Test.ValidacaoPesquisa;
import Test.EscolherProduto;
import Test.AdicionarAoCarrinho;
import Test.ValidacaoProdutoCarrinho;


@RunWith(Suite.class)
@SuiteClasses({
	AcessarSite.class,
	PesquisarProduto.class,
	ValidacaoPesquisa.class,
	EscolherProduto.class,
	AdicionarAoCarrinho.class,
	ValidacaoProdutoCarrinho.class
})
public class SuiteTeste {

}

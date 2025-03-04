package demo.sa304.DTO;

import demo.sa304.Entity.Erro;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class ErroDTO {
    private Long id_erro;
    private String descricao_erro;
    private Integer qntd_produto ;
    private String nome_erro;
    private ProdutoDTO produto;

    public ErroDTO(){}

    public ErroDTO(Erro erro){
        BeanUtils.copyProperties(erro, this);
        if (erro != null && erro.getProduto() != null) {
            this.produto = new ProdutoDTO(erro.getProduto());
        }
    }
}

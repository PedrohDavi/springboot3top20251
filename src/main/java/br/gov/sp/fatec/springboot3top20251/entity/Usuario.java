package br.gov.sp.fatec.springboot3top20251.entity;

@Entity
@Table(name = "usr_usuario")
public class Usuario {

    @Id
    @GeneratedValue()
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_senha")
    private String senha;
}

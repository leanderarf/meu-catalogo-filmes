package br.com.meucatalogo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Usuario {
    int idUsuario;
    String nome;
    LocalDate dataNascimento;
    String email;
    String telefone;
    String senha;
    private Scanner leitor;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Usuario(int idUsuario, String nome, LocalDate dataNascimento, String email, String telefone, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome Completo: " + nome +
                "\nData de Nascimento: " + dataNascimento.format(formato) +
                "\nEmail: " + email +
                "\nTelefone: " + telefone;
    }

//    public void registraUsuario() {
//        leitor = new Scanner(System.in);
//
//        System.out.println("Nome Completo:");
//        nome = leitor.nextLine();
//
//        System.out.println("Data de Nascimento (dd/MM/yyyy):");
//        String dataString = leitor.nextLine();
//
//        System.out.println("Email:");
//        email = leitor.nextLine();
//
//        System.out.println("Telefone:");
//        telefone = leitor.nextLine();
//
//        System.out.println("Defina uma senha:");
//        senha = leitor.nextLine();
//
//        String confirma = "";
//        do {
//            System.out.println("Confirme a senha:");
//            confirma = leitor.nextLine();
//
//            if (!senha.equals(confirma)) {
//                System.out.println("As senhas não coincidem! Tente novamente.");
//            }
//        }while(!senha.equals(confirma));
//
//        formato = new SimpleDateFormat("dd/MM/yyyy");
//
//        try{
//            dataNascimento = formato.parse(dataString);
//        } catch (ParseException e){
//            System.out.println("Formato de data inválido! Use dd/MM/yyyy");
//        }
//
//        System.out.println("Usuário registrado com sucesso!!");
//    }
}

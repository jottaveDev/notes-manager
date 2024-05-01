/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Murilo Studio
 */
public class TesteDB {
    public static void main(String[] args) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
    }
}

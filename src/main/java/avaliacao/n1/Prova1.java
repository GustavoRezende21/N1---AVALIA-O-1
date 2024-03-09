/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package avaliacao.n1;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */

import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        
        // Declaração das variáveis de contagem de itens adicionados (Tipo Inteiro)
        int opcao = 0, qde_expresso=0, qde_capuccino=0, 
            qde_leite_com_cafe=0, qde_produtos_vendidos;
        // Declaração das variáveis de soma de valores (Tipo Double)
        double valor_expresso, valor_capuccino,
            valor_leite_com_cafe, valor_produtos_vendidos=0;
        
        // Declaração das variáveis de novos produtos e de valores
        int qde_mistoquente=0, qde_paocomovo=0, qde_sucodelaranja=0;
        double valor_mistoquente, valor_paocomovo, valor_sucodelaranja;
                
        // Variável de pagamento parcial
        double pgto_parcial=0;
        int opcaodepgto=0;
        
        // Importação do Scanner para ler os dados que foram digitados pelo usuário
        Scanner sc = new Scanner(System.in);
    
        // Laço de repetição
        do {
        
                // Apresentar na tela as opções de produtos
                System.out.println("Forneça uma opção: \n"+
                                    "1 -­ café expresso; \n"+
                                    "2 -­ café capuccino; \n"+
                                    "3 -­ leite com café; \n"+

                                    // Opção de leitura para novas variáveis
                                    "4 -­ misto quente; \n"+
                                    "5 -­ pão com ovo; \n"+
                                    "6 -­ suco de laranja; \n"+
                        
                                    "8­ - pagar parcial; \n"+
                
                                    "8­ - totalizar vendas");
                
                // Leitura da opção digitada pelo método Scanner
                opcao = sc.nextInt();
      
                // Estrutura condicional para definir qual opção o usuário escolheu
                if ( opcao == 1 ) qde_expresso++;
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_leite_com_cafe++;
                
                // Condição para os novos produtos
                else if (opcao == 4) qde_mistoquente++;
                else if (opcao == 5) qde_paocomovo++;
                else if (opcao == 6) qde_sucodelaranja++;
                else if (opcao == 7) {
                
        // Pagamento parcial da conta
        // Pergunta ao usuário como deseja pagar a sua conta
        System.out.println("Deseja pagar a conta parcial? ");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        opcaodepgto = sc.nextInt();
        
        // Se escolher a opção 1, o sistema te perguntará quanto você deseja pagar
        System.out.println();
        if (opcaodepgto == 1) {
            System.out.println("Quanto deseja pagar?");
            pgto_parcial = sc.nextDouble();
        
            // Processamento de quanto o cliente quer pagar pelo valor total da conta
            pgto_parcial = valor_produtos_vendidos - pgto_parcial;
        }
        
        // Se o cliente escolher a conta 2, automaticamente o sistema pagará a conta por completo
        else if (opcaodepgto == 2) {
        System.out.println("Conta paga com sucesso!");
        
        // Se o valor do pagamento parcial for diferente de zero, significa que o cliente não terminou de pagar a conta
        if (pgto_parcial != 0) {
            System.out.println("Você não terminou de pagar a conta");
            }
                                
                // Caso digite uma opção diferente de 1 a 8, o sistema informará na tela que a opção é inválida
                else if (opcao != 8) System.out.println("Opção inválida");
      
        // Fim do laço de repetição
        } while ( opcao != 8);
    
        // Declaração dos valores de cada produto
        // O valor do café expresso é a quantidade de café expresso digitados pelo produto de 0.75
        valor_expresso = qde_expresso*0.75;
        // O valor de cada capuccino é igual a quantidade de capuccino que forem inseridos, então 1 capuccino = R$1
        valor_capuccino = qde_capuccino;   
        // O valor do café com leite é a quantidade de café expresso digitados pelo produto de 1.25
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;     
        
        // Processamento das variáveis dos novos produtos
        valor_mistoquente = qde_mistoquente * 6;
        valor_paocomovo = qde_paocomovo * 4;
        valor_sucodelaranja = qde_sucodelaranja * 6;
        
        // A quantidade de cafés ventidos é a soma de todas as variáveis quantitativas
        qde_produtos_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe + qde_mistoquente + qde_paocomovo + qde_sucodelaranja;
        // O valor total da conta é a soma de todas as variáveis de soma de valores de cada produto
        valor_produtos_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe + valor_mistoquente + valor_paocomovo + valor_sucodelaranja;
    
        // Exibição na tela da quantidade de produtos que foram comprados e o valor total a ser pago
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+" ­ valor: "+valor_leite_com_cafe);    
        
        // Exibição na tela dos novos produtos incluídos
        System.out.println("Qde misto quente: "+qde_mistoquente+" ­ valor: "+valor_mistoquente);
        System.out.println("Qde pao com ovo: "+qde_paocomovo+" ­ valor: "+valor_paocomovo);    
        System.out.println("Qde suco de laranja: "+qde_sucodelaranja+" ­ valor: "+valor_sucodelaranja);    
        
        System.out.println("Qde produtos vendidos: "+ qde_produtos_vendidos +" ­ valor produtos vendidos: "+valor_produtos_vendidos);
        
                }
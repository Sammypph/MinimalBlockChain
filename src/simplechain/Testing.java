/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplechain;

import java.util.ArrayList;
import java.util.Scanner;
import static simplechain.Simplechain.addBlock;
import static simplechain.Simplechain.walletA;
import static simplechain.Simplechain.walletB;
import static simplechain.Simplechain.walletC;
import static simplechain.Simplechain.walletD;
import static simplechain.Simplechain.walletE;

import static simplechain.Simplechain.addBlock;
import static simplechain.Simplechain.genesisTransaction;
import static simplechain.Simplechain.wallets;
/**
 *
 * @author Oluwasanmi
 */

public class Testing {
    
    public static void TestCases(){
                //testing                    
                System.out.println("Creating and Mining Genesis block... ");
		Block genesis = new Block("0");
		genesis.addTransaction(genesisTransaction);
		addBlock(genesis);
                
                System.out.println();
                String output = String.format("There are currently %d people with wallets ", wallets.size());
                System.out.println(output);             
                           
                
		Block block1 = new Block(genesis.hash);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("\nWalletA is Attempting to send funds (40) to WalletB...");
		block1.addTransaction(walletA.sendFunds(walletB.publicKey, 40f));
		addBlock(block1);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		Block block2 = new Block(block1.hash);
		System.out.println("\nWalletA Attempting to send more funds (1000) than it has...");
		block2.addTransaction(walletA.sendFunds(walletB.publicKey, 1000f));
		addBlock(block2);
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
		Block block3 = new Block(block2.hash);
		System.out.println("\nWalletB is Attempting to send funds (20) to WalletA...");
		block3.addTransaction(walletB.sendFunds( walletA.publicKey, 20));
		System.out.println("\nWalletA's balance is: " + walletA.getBalance());
		System.out.println("WalletB's balance is: " + walletB.getBalance());
		
    }   
}

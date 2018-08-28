# MinimalBlockChain
A simple block chain implementation
Install dependencies
- GSON i.e for converting objects into Json
- bouncey - https://www.bouncycastle.org/latest_releases.html  i.e This is a hashing library

The Package has eight class including the main class
- Wallet: This class used to hold monetary value for the blocks
- Block: This class creates the blocks
- Transaction: This is a collection of transaction that is being carried out on the block chain
- TransactionInput: Takes the Transaction Ouput ID of the previous block as input
- TransactionOuput: Computes the transaction output of a block
- Simplechain:  This is the main class
- Testing: This class holds the sample test for the blockchain
- StringUtil: This class performs most of the encryption used by the blocks

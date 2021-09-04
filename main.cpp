#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>

using namespace std;

int main(int argc, const char * argv[]){
    int operations, char label, int compra, int venda;

    map<int, int> compras;
    map<int, int> vendas;

    int filename [] = [30,100,300,1000,3000,5000,10000,100000,1000000]; 
    String folder = "instancias";
    String path = folder +  "/" + filename[0] + ".txt";  
    ifstream file;

    file.open(path,ios::in);
    if (!file.eof) {
        cout << "Erro na abertura " << endl;
        exit (1);
    } else {
        cout << "Abertura OK" << endl;
    } 

    string S;
    getline(file, S);
    operations = atoi(S.c_str());
    
    while(getline(file, S))) {
        getline(file, S);
        springstream stream(S);
        label

    }

    cout << operations << "\n";



    clientes = new Cliente[nroDeContas];
    
    cout << "nroDeContas: " << nroDeContas << endl;
    for (int c = 0;c < nroDeContas;c++) {
        getline(file, Nome);
        this->nome[c] = Nome;
        //cout << "Linha Lida(nome): "<< Nome << endl;
        getline(file, S);
        this->cpf[c] = S;
        //cout << "Linha Lida(cpf): "<< S  << endl;
        int CPF = atoi(S.c_str());  
        insereCliente(CPF, Nome);
  }
}

void operacao {

}
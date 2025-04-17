#include <iostream>
#include <ctime>
#include <chrono>
using namespace std;
using namespace std::chrono;
void selectionSort(int vetor[], int tamanho){
    for(int i = 0; i < tamanho - 1; i++){
        int auxiliar = i;
        for(int j = i+1; j < tamanho; j++){
            if(vetor[j] < vetor[auxiliar]){
                auxiliar = j;
            }
        }
        swap(vetor[i], vetor[auxiliar]);
    }
}

int main(){
    int vetor[] = {
        42, 67, 15, 90, 21, 83, 57, 75, 11, 33,
        95, 27, 44, 39, 52,  1, 99, 85, 72, 68,
        23, 91, 29, 60, 63, 65, 22, 13, 47, 64,
        93, 50, 97, 30, 73, 17, 77, 55, 31, 79,
        49, 82, 96, 25, 16, 69, 89, 37,  7, 41,
         2, 92, 81, 74, 19, 58, 45, 86, 70, 38,
         6, 35, 24, 87, 20, 56,  5, 14, 46, 76,
        84, 10, 48, 78, 61, 98, 36, 53, 26, 66,
         3, 88, 28, 40, 18, 94, 34,  8, 59,  9,
        51, 12, 80, 43, 54,  4, 62, 71, 32,  0
    };
    auto start = high_resolution_clock::now();
    selectionSort(vetor, 100);
    auto stop = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(stop - start);
    for(int i = 0; i < 100; i++){
        cout << vetor[i] << " ";
    }

    cout << endl << "Tempo de execucao: " << duration.count() << " microssegundos\n";

    return 0;
}
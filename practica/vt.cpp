#include <bits/stdc++.h>
#include <fstream>
#include <iomanip>

using namespace std;

const int NO_OF_CANDIDATES = 6; 
const int NO_OF_REGIONS = 4; 

void printHeading();
void initialize(int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows); 
void getCandidatesName(ifstream& inp, string cNames[], int noOfRows); 
void sortCandidatesNames(string cNames[], int noOfRows); // Nota: Se corrigió el nombre de la función
int binSearch(string cNames[], int noOfRows, string name); 
void processVotes(ifstream& inp, string cNames[], int vbRegion[][NO_OF_REGIONS], int noOfRows); // Nota: Se corrigió el nombre de la función
void addRegionsVote(int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows); 
void printResults(string cNames[], int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows);

int main(){
    // Declarar variables paso 1.
    string candidatesNames[NO_OF_CANDIDATES];
    int votesByRegion[NO_OF_CANDIDATES][NO_OF_REGIONS];
    int totalVotes[NO_OF_CANDIDATES]; // Nota: Se corrigió el nombre de la variable
    ifstream infile; 

    infile.open("candData.txt"); 
    if(!infile){
        cout << "El archivo de entrada (candData.txt) no existe." << endl; 
        return 1;
    }     

    getCandidatesName(infile, candidatesNames, NO_OF_CANDIDATES);
    sortCandidatesNames(candidatesNames, NO_OF_CANDIDATES); 

    infile.close();
    infile.clear(); 

    infile.open("voteData.txt"); 
    if(!infile){
        cout << "El archivo de entrada (voteData.txt) no existe." << endl; 
        return 1; 
    }

    initialize(votesByRegion, totalVotes, NO_OF_CANDIDATES); 
    processVotes(infile, candidatesNames, votesByRegion, NO_OF_CANDIDATES); 
    addRegionsVote(votesByRegion, totalVotes, NO_OF_CANDIDATES); 
    printHeading(); 
    printResults(candidatesNames, votesByRegion, totalVotes, NO_OF_CANDIDATES);

    return 0; 
}

void getCandidatesName(ifstream& inp, string cNames[], int noOfRows){
    int i; 
    for(i = 0; i < noOfRows; i++){
        inp >> cNames[i];
    }
}

void sortCandidatesNames(string cNames[], int noOfRows){
    int firstOutOfOrder, location;
    string temp; 
    for(firstOutOfOrder = 1; firstOutOfOrder < noOfRows; firstOutOfOrder++){
        if(cNames[firstOutOfOrder] < cNames[firstOutOfOrder - 1]){
            temp = cNames[firstOutOfOrder]; 
            location = firstOutOfOrder; 
            do{
                cNames[location] = cNames[location - 1]; 
                location--;
            } while(location > 0 && cNames[location - 1] > temp); 
            cNames[location] = temp;
        }
    } 
}

void initialize(int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows){
    int i, j; 
    for(i = 0; i < noOfRows; i++) {
        for(j = 0; j < NO_OF_REGIONS; j++) {
            vbRegion[i][j] = 0; 
        }
        tVotes[i] = 0; 
    }
}

int binSearch(string cNames[], int noOfRows, string name){
    int first, last, mid;
    bool found = false; 
    first = 0; 
    last = noOfRows - 1;
    while(!found && first <= last){
        mid = (first + last) / 2;
        if(cNames[mid] == name)
            found = true; 
        else if(cNames[mid] > name)
            last = mid - 1;
        else
            first = mid + 1;
    }
    if(found)
        return mid;
    else
        return -1;
}

void processVotes(ifstream& inp, string cNames[], int vbRegion[][NO_OF_REGIONS], int noOfRows){
    string candName; 
    int region; 
    int noOfVotes; 
    int loc; 
    inp >> candName >> region >> noOfVotes; 
    while(inp){
        loc = binSearch(cNames, noOfRows, candName); // Nota: Se corrigió el nombre de la variable
        if(loc != -1)
            vbRegion[loc][region - 1] = vbRegion[loc][region - 1] + noOfVotes;
        inp >> candName >> region >> noOfVotes; 
    }
}

void addRegionsVote(int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows){
    int i, j; 
    for(i = 0; i < noOfRows; i++) {
        for(j = 0; j < NO_OF_REGIONS; j++) {
            tVotes[i] = tVotes[i] + vbRegion[i][j]; 
        }
    }
}

void printHeading(){
    cout << "-------- Resultados de la eleccion ---------" << endl; 
    cout << " Nombre del " << endl;
    cout << " candidato Region1 Region2 Region3 Region4 Total " << endl; 
    cout << " --------- ------- ------- ------- ------- ----- " << endl; 
}

void printResults(string cNames[], int vbRegion[][NO_OF_REGIONS], int tVotes[], int noOfRows){
    int i, j; 
    int largestVotes = 0; 
    int winLoc = 0; 
    int sumVotes = 0;
    for (i = 0; i < noOfRows; i++) {
        if (largestVotes < tVotes[i]) {
            largestVotes = tVotes[i]; 
            winLoc = i;
        }
        sumVotes = sumVotes + tVotes[i]; 
        cout << left;
        cout << setw(9) << cNames[i] << " "; 
        cout << right; 
        for (j = 0; j < NO_OF_REGIONS; j++) {
            cout << setw(8) << vbRegion[i][j] << " "; 
        }
        cout << setw(6) << tVotes[i] << endl;
    }
    cout << endl << endl << "Ganador: " << cNames[winLoc] << ", Votos recibidos: " << tVotes[winLoc] << endl << endl;
    cout << "Votos totales emitidos: " << sumVotes << endl;
}

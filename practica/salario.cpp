#include <bits/stdc++.h> 
using namespace std; 

int main(){
    ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    
    double salario; 
    int tiempo_empresa;
    double salario_total = 0;
    double promedio_salarios;
    int max = 0;
    char opc; 
    int i = 1;
    int cont = 0;
    int num_empleados = 0;
    
    do{
        cout << "ingrese el salario del empleado "<< i++ <<":"<< endl;
        cin >> salario; 
        cout << "ingrese cuantos años tiene el empleado en la empresa: " << endl;
        cin >> tiempo_empresa;
        
        if(tiempo_empresa > 30){
            salario_total += salario * 1.4 + salario; 
            cont++;
        }else{
            salario_total += 2 * salario;
        }
        if(tiempo_empresa > max ){
            max = tiempo_empresa; 
        }
        num_empleados++;

        cout << "quieres dar otros datos del empleado?"<< endl;
        cin >> opc; 
    }while(opc != 'n');

    promedio_salarios = salario_total / num_empleados;
    cout << "Salario total: " << salario_total << ", Empleado con mayor antigüedad: " << max << ", Promedio de salarios: "<< promedio_salarios << endl;
    cout << "Número de empleados con sobresueldo: " << cont << endl;
    cout << "programa terminado"<< '\n';

    return 0;
}
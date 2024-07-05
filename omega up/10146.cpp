#include<bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int N;
    cin >> N;
    vector<pair<int, int>> carritos(N);
    for(int i = 0; i < N; i++) {
        cin >> carritos[i].first >> carritos[i].second;
    }

    // Ordenamos los carritos por posición
    sort(carritos.begin(), carritos.end());

    // Creamos una cola de prioridad para almacenar los tiempos en que cada carrito alcanzará al siguiente
    priority_queue<pair<double, pair<int, int>>, vector<pair<double, pair<int, int>>>, greater<pair<double, pair<int, int>>>> pq;

    for(int i = 0; i < N-1; i++) {
        if(carritos[i].second > carritos[i+1].second) {
            double tiempo = (double)(carritos[i+1].first - carritos[i].first) / (carritos[i].second - carritos[i+1].second);
            pq.push({tiempo, {i+1, i+2}});
        }
    }

    if(pq.empty()) {
        cout << -1 << endl;
    } else {
        cout << fixed << setprecision(9) << pq.top().first << " " << pq.top().second.first << " " << pq.top().second.second << endl;
    }

    return 0;
}
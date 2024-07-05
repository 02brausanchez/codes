#include <iostream>
#include <vector>
#include <queue>
using namespace std;

const int MAXN = 400005;

vector<int> adj[MAXN];
int color[MAXN]; // 0 means uncolored, 1 and 2 represent two different colors

bool bfs(int start, int n) {
    queue<int> q;
    q.push(start);
    color[start] = 1;

    while (!q.empty()) {
        int u = q.front();
        q.pop();

        for (int v : adj[u]) {
            if (color[v] == 0) {
                color[v] = (color[u] == 1) ? 2 : 1;
                q.push(v);
            } else if (color[v] == color[u]) {
                return false; // Found an odd cycle
            }
        }
    }

    return true;
}

int main() {
    int n, m;
    cin >> n >> m;

    vector<pair<int, int>> animals(n);
    for (int i = 0; i < n; ++i) {
        cin >> animals[i].first >> animals[i].second;
    }

    for (int i = 0; i < m; ++i) {
        int x, y;
        cin >> x >> y;
        adj[x].push_back(y);
        adj[y].push_back(x);
    }

    // Check if the graph is bipartite
    bool possible = true;
    for (int i = 1; i <= n; ++i) {
        if (color[i] == 0) {
            if (!bfs(i, n)) {
                possible = false;
                break;
            }
        }
    }

    if (possible) {
        cout << "possible" << endl;
    } else {
        cout << "impossible" << endl;
    }

    return 0;
}


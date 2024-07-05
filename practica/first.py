import numpy as np

def eliminacion_gaussiana(A,b):
    n = len(A)
    for i in range(n):
        # Metodo del pivoteo
        for j in range(i+1, n):
            factor = A[j][i] / A[i][i]
            for k in range(n):
                A[j][k] -= factor * A[i][k]
            b[j] -= factor * b[i]

    # Sustitucion hacia atras
    x = np.zeros(n)
    for i in range(n-1, -1, -1):
        x[i] = b[i]
        for j in range(i+1, n):
            x[i] -= A[i][j] *x[j]
        x[i] = x[i] / A[i][i]
    return x

A = np.array([[12,10,8],[25,13,5],[3,24,17]]).astype(float)
b = np.array([11,21,13])
x = eliminacion_gaussiana(A.copy(), b.copy())
print(x)

Ax = np.dot(A,x)
print(Ax)
#print()
print(b)
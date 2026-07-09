class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:

        theZeroes :List[int] = [] 


        line : int = len(matrix) ; column : int = len(matrix[0])


        for i in range(line):
            for j in range(column):
                if matrix[i][j] == 0 : theZeroes.append([i,j])


        for arr in theZeroes : 
            matrix[arr[0]] = [0]*column

            for i in range(line):
                matrix[i][arr[1]] = 0 


        return None                


        
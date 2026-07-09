class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        line : int = len(matrix) ; column : int = len(matrix[0])
        
        leftEdgeline  = leftEdgeColumn =  0 
        rightEdgeline = line-1
        rightEdgeColumn = column -1
        
        answer : List[int] = []
        while leftEdgeline < rightEdgeline and leftEdgeColumn < rightEdgeColumn:


            for j in range(leftEdgeColumn ,rightEdgeColumn):
                answer.append(matrix[leftEdgeline][j])


            for i in range(leftEdgeline , rightEdgeline):
                answer.append(matrix[i][rightEdgeColumn])    


            for j in range(rightEdgeColumn ,leftEdgeColumn,-1):
                answer.append(matrix[rightEdgeline][j])


            for i in range(rightEdgeline , leftEdgeline,-1):
                answer.append(matrix[i][leftEdgeColumn])

            leftEdgeColumn+=1
            leftEdgeline+=1
            rightEdgeline-=1
            rightEdgeColumn-=1            


        while  leftEdgeline < rightEdgeline  :
            answer.append(matrix[leftEdgeline][leftEdgeColumn])
            leftEdgeline +=1





        while leftEdgeColumn <= rightEdgeColumn:
            answer.append(matrix[leftEdgeline][leftEdgeColumn])
            leftEdgeColumn +=1

        
        return answer[:line*column] 
        

       
        
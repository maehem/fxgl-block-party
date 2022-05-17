/*
    Licensed to the Apache Software Foundation (ASF) under one or more 
    contributor license agreements.  See the NOTICE file distributed with this
    work for additional information regarding copyright ownership.  The ASF 
    licenses this file to you under the Apache License, Version 2.0 
    (the "License"); you may not use this file except in compliance with the 
    License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the 
    License for the specific language governing permissions and limitations 
    under the License.
*/
package com.maehem.blockparty;

import javafx.scene.shape.Mesh;
import javafx.scene.shape.TriangleMesh;

/**
 *
 * @author mark
 */
public class MeshFactory {
    
    public static Mesh cubeMesh() {
        TriangleMesh mesh = new TriangleMesh();
        
        mesh.getPoints().addAll(
                 1.0f,  1.0f,  1.0f, // Vertex 0
                 1.0f,  1.0f, -1.0f, // Vertex 1
                 1.0f, -1.0f,  1.0f, // Vertex 2
                 1.0f, -1.0f, -1.0f, // Vertex 3
                -1.0f,  1.0f,  1.0f, // Vertex 4
                -1.0f,  1.0f, -1.0f, // Vertex 5
                -1.0f, -1.0f,  1.0f, // Vertex 6
                -1.0f, -1.0f, -1.0f  // Vertex 7
        );
        mesh.getTexCoords().addAll(
                0.25f, 0.00f,
                0.50f, 0.00f,
                0.00f, 0.333f,
                0.25f, 0.333f,
                0.50f, 0.333f,
                0.75f, 0.333f,
                1.00f, 0.333f,
                0.00f, 0.666f,
                0.25f, 0.666f,
                0.50f, 0.666f,
                0.75f, 0.666f,
                1.00f, 0.666f,
                0.25f, 1.00f,
                0.50f, 1.00f
        );
        
        /*
            Faces List
        
            Example:   0,10 
                       0 = index into points list.  
                      10 = index into textCoords list.

         */
        mesh.getFaces().addAll(
            0,10,  2,5,   1,9,
            2,5,   3,4,   1,9,
            4,7,   5,8,   6,2,
            6,2,   5,8,   7,3,
            0,13,  1,9,  4,12,
            4,12,  1,9,   5,8,
            2,1,   6,0,   3,4,
            3,4,   6,0,   7,3,
            0,10, 4,11,   2,5,
            2,5,  4,11,   6,6,
            1,9,   3,4,   5,8,
            5,8,   3,4,   7,3            
        );

        return mesh;
    }
    
    /**
     * Pyramid mesh.
     * @see <a href="http://www.lagers.org.uk/javafx/usemeshview.html">Using MeshView</a>
     * 
     * @return a pyramid mesh.
     */
    public static Mesh pyramidMesh() {
        TriangleMesh mesh = new TriangleMesh();
        
        mesh.getPoints().addAll(
                 1.0f,  1.0f,  1.0f, // Vertex 0
                 1.0f,  1.0f, -1.0f, // Vertex 1
                -1.0f,  1.0f,  1.0f, // Vertex 2
                -1.0f,  1.0f, -1.0f, // Vertex 3
                 0.0f, -1.0f,  0.0f  // Vertex 4
        );
        
        mesh.getTexCoords().addAll(
                0.25f, 0.00f,
                0.50f, 0.00f,
                0.00f, 0.333f,
                0.25f, 0.333f,  // 3: top BL, 2TL
                0.50f, 0.333f,  // 4: top BR, 2TR
                0.75f, 0.333f,
                1.00f, 0.333f,
                0.00f, 0.666f,
                0.25f, 0.666f,  // 8: bottom TL
                0.50f, 0.666f,  // 9: bottom TR
                0.75f, 0.666f,
                1.00f, 0.666f,
                0.25f, 1.00f,  // 12: bottom L
                0.50f, 1.00f,   // 13: bottom R
                0.125f, 0.333f,
                0.375f, 0.333f,
                0.625f, 0.333f,
                0.875f, 0.333f
        );
        
        /*  Faces List
        
            Example:   0,10 
                       0 = index into points list.  
                      10 = index into textCoords list.
         */
        mesh.getFaces().addAll(
              0,9,   1,8,   3,12,  // Bottom A
              0,9,   3,12,  2,13,   // Bottom B
              
              3,7,  1,8,   4,14,  // Side 1
              4,15,  1,8,   0,9,  // Side 2
              0,9,  2,10,  4,16,  // Side 3
              4,17,  2,10,  3,11  // Side 4              
        );

        return mesh;
    }
    
    public static Mesh wedgeMesh() {
        TriangleMesh mesh = new TriangleMesh();
        
        mesh.getPoints().addAll(
                // Bottom points
                 1.0f,  1.0f,  1.0f, // Vertex 0
                 1.0f,  1.0f, -1.0f, // Vertex 1
                -1.0f,  1.0f,  1.0f, // Vertex 2
                -1.0f,  1.0f, -1.0f, // Vertex 3

                1.0f, -1.0f,  1.0f, // Vertex 4
               1.0f, -1.0f,  -1.0f  // Vertex 5
        );
        mesh.getTexCoords().addAll(
                0.25f, 0.00f,    // 0
                0.50f, 0.00f,    // 1
                0.00f, 0.333f,   // 2
                0.25f, 0.333f,   // 3
                0.50f, 0.333f,   // 4
                0.75f, 0.333f,   // 5
                1.00f, 0.333f,   // 6
                0.00f, 0.666f,   // 7
                0.25f, 0.666f,   // 8
                0.50f, 0.666f,   // 9
                0.75f, 0.666f,   // 10
                1.00f, 0.666f,   // 11
                0.25f, 1.00f,    // 12
                0.50f, 1.00f     // 13
        );
        
        /*  Faces List
            Example:   0,10 
                       0 = index into points list.  
                      10 = index into textCoords list.
         */
        mesh.getFaces().addAll(
            2,8,  0,12, 1,13, // bottom A
            2,8,  1,13, 3,9,  // bottom B
            
            2,8,  3,9,  4,3,
            4,3,  3,9,  5,4,   
            
            0,7,  2,8,  4,2,  //    Face "1"  tex: 2,7,8
            5,5,  3,9,  1,10, //    Face "3"  tex: 5,9,10
            
            1,10, 0,11, 4,6,  //    Face "4a" tex: 5,6,10,11
             5,5, 1,10, 4,6   //    Face "4a" tex: 5,6,10,11
        );

        return mesh;
    }
    
    public static Mesh cornerWedgeMesh(float size) {
        TriangleMesh mesh = new TriangleMesh();
        
        float r = size/2;   // "radius" from center.
        
        mesh.getPoints().addAll(
                // Bottom points
                 r,  r,  r, // Vertex 0
                 r,  r, -r, // Vertex 1
                -r,  r,  r, // Vertex 2
                -r,  r, -r, // Vertex 3

                r, -r,  -r  // Vertex 4
        );
        
        // Percentages into the X/Y of the source image.
        mesh.getTexCoords().addAll(
                0.25f, 0.00f,    // 0
                0.50f, 0.00f,    // 1
                0.00f, 0.333f,   // 2
                0.25f, 0.333f,   // 3
                0.50f, 0.333f,   // 4
                0.75f, 0.333f,   // 5
                1.00f, 0.333f,   // 6
                0.00f, 0.666f,   // 7
                0.25f, 0.666f,   // 8
                0.50f, 0.666f,   // 9
                0.75f, 0.666f,   // 10
                1.00f, 0.666f,   // 11
                0.25f, 1.00f,    // 12
                0.50f, 1.00f     // 13
        );
        
        /*  Faces List
            Example:   0,10 
                       0 = index into points list.  
                      10 = index into textCoords list.
         */
        mesh.getFaces().addAll(
            2,8,  0,12, 1,13,  // bottom A
            2,8,  1,13, 3,9,   // bottom B
            
            2,8,  3,9,  4,4,   // Face "2a"  tex: 8,9,4
            
            0,7,  2,8,  4,2,   //  Face "1"  tex: 2,7,8
            4,5,  3,9,  1,10,  //  Face "3"  tex: 5,9,10
            
            1,10, 0,11, 4,5    //  Face "4a" tex: 5,10,11
        );

        return mesh;
    }
}

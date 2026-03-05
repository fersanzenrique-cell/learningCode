<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Tabla de libros</title>
                <style>
                    body { 
                        font-family: Verdana, sans-serif;
                        margin: 30px;
                        background:#eef2f3; 
                    }
                    h1 { 
                        color: #34495e; 
                        text-align: center; 
                    }
                    table { 
                        width: 70%; 
                        margin: 20px auto; 
                        border-collapse: collapse;
                        background: #ffffff; 
                    }
                    th, td { 
                        border: 1px solid #999; 
                        padding: 10px; 
                        text-align: center; 
                    }
                    th { 
                        background-color: #2ecc71; 
                        color: white; 
                    }
                </style>
            </head>
            <body>
                <h1>Tabla de libros</h1>
                <table>
                    <tr>
                        <th>Titulo</th>
                        <th>Autor</th>
                        <th>Genero</th>
                        <th>Precio</th>
                    </tr>
                    <xsl:for-each select="libreria/libro">
                        <tr>
                            <td>
                                <xsl:value-of select="titulo"/>
                            </td>
                            <td>
                                <xsl:value-of select="autor"/>
                            </td>
                            <td>
                                <xsl:value-of select="genero"/>
                            </td>
                            <td>
                                <xsl:value-of select="precio"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
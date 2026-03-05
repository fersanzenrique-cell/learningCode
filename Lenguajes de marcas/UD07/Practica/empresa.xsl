<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
    <html>
      <head>
        <title>Empresa</title>
        <meta charset="utf-8"/>
      </head>
      <body>
        <h1>Investigacion y Desarrollo</h1>
        <table>
          <tr>
            <th>Nombre</th>
            <th>Trabajo</th>
            <th>Sueldo</th>
          </tr>
          <xsl:for-each select="empresa/investigacion/empleado">
            <xsl:sort select="sueldo"/>
            <tr>
              <td><xsl:value-of select="nombre"/></td>
              <td><xsl:value-of select="trabajo"/></td>
              <td><xsl:value-of select="sueldo"/></td>
            </tr>
          </xsl:for-each>
        </table>
        <h1>Marketing</h1>
        <table>
          <tr>
            <th>Nombre</th>
            <th>Trabajo</th>
            <th>Sueldo</th>
          </tr>
          <xsl:for-each select="empresa/marketing/empleado">
            <xsl:sort select="sueldo"/>
            <tr>
              <td><xsl:value-of select="nombre"/></td>
              <td><xsl:value-of select="trabajo"/></td>
              <td><xsl:value-of select="sueldo"/></td>
            </tr>
          </xsl:for-each>
        </table>

      </body>
    </html>
    
  </xsl:template>  
</xsl:stylesheet>
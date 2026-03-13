<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <!DOCTYPE html>
    <html>
      <head>
        <meta charset="UTF-8"/>
        <title>Titulo</title>
        <style></style>
      </head>
      <body>
        <table border="1">
          <tr>
            <th></th>
            <th></th>
            <th></th>
          </tr>
          <xsl:for-each select="">
            <xsl:sort select=""/>
              <tr>
                <td><xsl:value-of select=""/></td>
                <td><xsl:value-of select=""/></td>
              </tr>
          </xsl:for-each>
          
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
<?xml version="1.0" encoding="UTF-16"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/Users">
        <table border="1">
            <tr><td>ID_User</td><td>First_Name</td><td>Middle_Name</td><td>Last_Name</td><td>Passport</td>
                <td>Address</td><td>Phone</td><td>Email</td><td>Nickname</td><td>Password</td><td>Roles</td>
                <td>Accounts/Payments</td></tr>
            <xsl:apply-templates/>
        </table>
    </xsl:template>
    <xsl:template match="/Users/User">
        <tr><td>
            <xsl:value-of select="@ID"/>
        </td>
        <xsl:apply-templates/></tr>
    </xsl:template>
    <xsl:template match="/Users/User/First_Name">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Middle_Name">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Last_Name">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Passport">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Address">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Phone">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Email">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Nickname">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Password">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Roll">
        <td><table border="1">
        <tr>
            <td>
                <xsl:value-of select="@idRoll"/>
            </td>
            <td>
                <xsl:value-of select="@name"/>
            </td>
        </tr>
        </table></td>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="/Users/User/Account">
        <td><table border="1">
        <tr><td>
            <xsl:value-of select="@idAccount"/>
        </td>
        <td>
            <xsl:value-of select="@state"/>
        </td>
        <xsl:apply-templates/></tr>
        </table></td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Amount">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment">
        <td><table border="1">
            <tr> <td>
                <xsl:value-of select="@idPayment"/>
            </td>
                <xsl:apply-templates/></tr>
        </table></td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment/Source">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment/Description">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment/Destination">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment/Date">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
    <xsl:template match="/Users/User/Account/Payment/Amount_p">
        <td>
            <xsl:apply-templates/>
        </td>
    </xsl:template>
</xsl:stylesheet>
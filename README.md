//class file

Imports System.Data.OleDb
Imports System.Data
Imports Microsoft.VisualBasic

Public Class Class1
    Dim cn As New OleDbConnection("")
    Dim cm As OleDbCommand
    Dim da As OleDbDataAdapter
    Dim ds As New DataSet

    Public Sub iud(ByVal str As String)
        If cn.State = ConnectionState.Closed = True Then
            cn.Open()
        End If
        cm = New OleDbCommand(str, cn)
        cm.ExecuteNonQuery()
        cn.Close()
    End Sub
    Public Function display(ByVal str As String) As DataSet
        da = New OleDbDataAdapter(str, cn)
        ds.Tables.Clear()
        da.Fill(ds)
        Return ds
    End Function
End Class


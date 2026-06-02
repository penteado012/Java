<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Créditos do Desenvolvedor</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f7f6;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .card {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        h1 { color: #2c3e50; margin-bottom: 5px; font-size: 24px; }
        p { color: #7f8c8d; margin: 10px 0; }
        .badge {
            background-color: #3498db;
            color: white;
            padding: 5px 15px;
            border-radius: 20px;
            font-size: 14px;
            display: inline-block;
            margin-top: 5px;
        }
        .btn-voltar {
            display: inline-block;
            margin-top: 25px;
            padding: 10px 20px;
            background-color: #2c3e50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background 0.3s;
        }
        .btn-voltar:hover { background-color: #1a252f; }
    </style>
</head>
<body>

    <div class="card">
        <h1>Matheus Penteado</h1>
        <span class="badge">Prontuário: CB3031501</span>
        <p>Projeto Acadêmico Java Web desenvolvido utilizando a arquitetura MVC com JSP, Servlets, Maven e banco de dados MySQL.</p>
        <p style="font-size: 12px; color: #bdc3c7;">© 2026 - Todos os direitos reservados</p>
        <a href="books" class="btn-voltar">Voltar para o Sistema</a>
    </div>

</body>
</html>
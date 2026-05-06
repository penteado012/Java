<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Créditos do Desenvolvedor</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { 
            background-color: #f8f9fa; 
            display: flex; 
            align-items: center; 
            justify-content: center;
            min-height: 100vh; 
            margin: 0;
        }
        .card { 
            width: 100%; 
            max-width: 500px; 
            border: none; 
            box-shadow: 0 10px 25px rgba(0,0,0,0.1); 
            border-radius: 15px;
        }
        .card-header { 
            background-color: #0d6efd; 
            color: white; 
            text-align: center; 
            border-radius: 15px 15px 0 0 !important; 
            padding: 20px;
        }
    </style>
</head>
<body>

    <div class="card">
        <div class="card-header">
            <h4 class="mb-0">Informações do Projeto</h4>
        </div>
        <div class="card-body p-4">
            <p class="text-muted small text-uppercase mb-1">Desenvolvedor</p>
            <h5 class="mb-4 text-primary">Matheus Penteado de Barros Pantojo</h5>
            
            <div class="row mb-3">
                <div class="col-sm-4 font-weight-bold">Instituição:</div>
                <div class="col-sm-8 text-secondary">IFSP - Campus Cubatão</div>
            </div>
            
            <div class="row mb-3">
                <div class="col-sm-4 font-weight-bold">Disciplina:</div>
                <div class="col-sm-8 text-secondary">CBTSWEI - Sistemas Web II</div>
            </div>
            
            <div class="row mb-4">
                <div class="col-sm-4 font-weight-bold">TP02:</div>
                <div class="col-sm-8 text-secondary">Trabalho Prático de CRUD</div>
            </div>
            
            <hr>
            
            <div class="d-flex justify-content-between mt-4">
                <a href="novoProduto.html" class="btn btn-outline-primary">Novo Cadastro</a>
                <a href="ListaProdutos" class="btn btn-primary">Ver Lista</a>
            </div>
        </div>
    </div>

</body>
</html>
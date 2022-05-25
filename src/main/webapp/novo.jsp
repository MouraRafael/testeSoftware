<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Aluno</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
</head>
<body>
    <div class="container col-6">
        <fieldset>
            <legend>Cadastrar Aluno</legend>
            <form action="CadastroAlunoServlet" method="post">
                <div class="form-group mb-3">
                    <label for="nome" class="form-label">Nome do Aluno</label>
                    <input type="text" class="form-control" name="txtAlunoNome" id="nome" placeholder="Informe o nome do aluno" required>
                </div><!--Nome do Aluno-->
                <div class="form-group">
                    <label for="nota1" class="form-label">Primeira Nota</label>
                    <input min="0" max="10" type="number" step="0.01" class="form-control" name="txtNotaUm" id="nota1" placeholder="Informe a primeira nota">
                </div>
                <div class="form-group">
                    <label for="nota2" class="form-label">Segunda Nota</label>
                    <input min="0" max="10" type="number" step="0.01" class="form-control" name="txtNotaDois" id="nota2" placeholder="Informe a segunda nota">
                </div>
                <div class="form-group">
                    <label for="nota3" class="form-label">Terceira Nota</label>
                    <input min="0" max="10" type="number" step="0.01" class="form-control" name="txtNotaTres" id="nota3" placeholder="Informe a terceira nota">
                </div>
                <button class="btn btn-dark my-2" type="submit" name="submit">Cadastrar</button>
            </form>
        </fieldset>
    </div>
</body>
</html>
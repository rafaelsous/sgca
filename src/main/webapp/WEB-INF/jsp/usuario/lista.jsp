<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Lista de Usuários</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<form class="form-horizontal" action="<c:url value="/usuarios/relatorio"/>">
				<ul>
					<c:forEach items="${usuarioList}" var="usuario">
						<li>${usuario.nome} - ${usuario.login}</li>
					</c:forEach>
				</ul>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-primary btn-block"><fmt:message key="rotulo.gerar.pdf" /></button>
				    </div>
				</div>
			</form>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>
<!-- /#page-wrapper -->
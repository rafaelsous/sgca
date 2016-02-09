<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header"><fmt:message key="rotulo.novo.usuario" /> </h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<form class="form-horizontal" action="<c:url value="/usuario"/>" method="POST">
				<div id="erros">
					<ul>
						<c:if test="${not empty errors}">
					        <div class="alert">
			                   <c:forEach var="error" items="${errors}">
				                	<p>${error.category } - ${error.message}</p>
				               </c:forEach>
					        </div>
					    </c:if>
					</ul>
				</div>
			
			    <div class="form-group">
				    <label for="nome" class="col-sm-2 control-label"><fmt:message key="campo.nome" />:</label> 
				    <div class="col-sm-10">
				    	<input id="nome" class="form-control" type="text" name="usuario.nome"/>
				    </div>
			    </div>
			    
			    <div class="form-group">
					<label for="login" class="col-sm-2 control-label"><fmt:message key="campo.login" />:</label>
					<div class="col-sm-10"> 
				    	<input id="login" class="form-control" type="text" name="usuario.login"/>
				    </div>
			    </div>
			    
			    <div class="form-group">
				    <label for="senha" class="col-sm-2 control-label"><fmt:message key="campo.senha" />:</label>
				    <div class="col-sm-10"> 
				    	<input id="senha" class="form-control" type="password" name="usuario.senha"/>
				    </div>
				</div>
				
				<%-- <div class="form-group">
				    <label for="confirmacao" class="col-sm-2 control-label"><fmt:message key="campo.confirmacao.senha" />:</label>
				    <div class="col-sm-10"> 
				    	<input id="confirmacao" class="form-control" equalTo="#senha" type="password" />
				    </div>
				</div> --%>
				
			    <div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
				      <button type="submit" class="btn btn-primary btn-block"><fmt:message key="rotulo.salvar" /></button>
				    </div>
				</div>
			</form>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
</div>
<!-- /#page-wrapper -->
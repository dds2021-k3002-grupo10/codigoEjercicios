<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<div class="panel-body   panelNoCopy">
    <ul class="highlights list-unstyled">
        <li class="version lineaBordeEL"> 
            <h3><strong>Ejercicio 101 -Transportes</strong></h3>
        </li> 
        <li> 
            <p class="parrafo">
                <strong class="text-primary">
                    Una empresa dedicada al transporte de mercancías ofrece a sus clientes que elijan el transportista
                    que va a hacer efectivo su envío. Cada transportista calcula el coste del envío de distintas
                    maneras. Por ejemplo, el envío estándar establece una tarifa por kilo para los envíos locales y otra
                    tarifa distinta para los envíos de larga distancia, mientras que otros transportistas, como UPS,
                    FedEx, etc. pueden hacer el cálculo de la tarifa teniendo en cuenta solamente el peso del paquete
                    o cualquier otra política distinta para llevar a cabo el mismo cálculo..
                </strong>
            </p>
        </li> 
    </ul>

    <div class="row">
        <div class="col-lg-6">
            <img src="images/ejercicios/cientouno.png"  class="img-responsive">
        </div>
        <div class="col-lg-6">
            <h3 class="title"> <strong>Formulario de trasportes</strong></h3>
            <div id="form" style="padding: 10px;">
                <form class="form-horizontal" role="form"   name="form" id="form" >
                    <div class="form-group"> 
                        <label class="col-sm-3 control-label">Transportista</label>
                        <div class="col-sm-9"> 
                            <div class="radio"> 
                                <label>
                                    <input type="radio" name="transportista" value="PRIVADO">Envio privado   
                                </label>
                            </div> 
                            <div class="radio">
                                <label> 
                                    <input type="radio" name="transportista" value="ESTANDAR">Envio estandar
                                </label> 
                            </div> 
                        </div> 
                    </div>
                    <div class="form-group"> 
                        <label class="col-sm-3 control-label">Tipo Envío</label>
                        <div class="col-sm-9"> 
                            <div class="radio"> 
                                <label>
                                    <input type="radio" name="tipo" value="LOCAL">Local   
                                </label>
                            </div> 
                            <div class="radio">
                                <label> 
                                    <input type="radio" name="tipo" value="LARGA_DISTANCIA">Larga Distancia
                                </label> 
                            </div> 
                        </div> 
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="distancia">distancia en kilomentros</label>
                        <div><input class="form-control" type="number" name="distancia" id="distancia" placeholder="distancia" required/></div>
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="peso">Peso en Kilos</label>
                        <div><input class="form-control" type="number" name="peso" id="peso" placeholder="Ingrese el peso" required/></div>
                    </div>
                    <div class="row">
                        <div class="col-sm-3 col-lg-offset-9">
                            <input type="button" class="btn btn-secondary" id="calcularPrecio" onclick="calcularPrecios()" value="Calcular Precio"> 

                        </div> 
                    </div>
                    <div class="row">
                        <div class="col-sm-12" id="mensaje">
                     
                        </div>
                    </div>
                </form> 
            </div>
        </div>
    </div>
</div> 


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ include file="include/begin-html.jsp" %>
<%@ include file="include/header-html.jsp" %>

<div class="main container">
    <div class="row">
    <legend> <h3>Refill the account</h3></legend>

    </div>
    <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
            <form class="form-horizontal" action="do?command=Refill&id_account=${id_account}" method="POST">
                <div class="form-group">
                    <label class="col-sm-4 control-label"># of account</label>
                    <div class="col-sm-8">
                        <p class="form-control-static">${id_account}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="amount" class="col-sm-4 control-label">Amount</label>
                    <div class="col-sm-8">
                        <div class="input-group">
                            <input type="text" class="form-control" id="amount" name="amount">
                            <span class="input-group-btn">
                                <button class="btn btn-success" type="submit">Refill</button>
                            </span>

                        </div>
                        <span class="help-block">Enter amount from 1 to 4 characters (integer) </span>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


<%@ include file="include/end-html.jsp" %>
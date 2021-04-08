﻿using Aula2.Entities;
using Aula2.Services;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Aula2.Controlers
{
    [ApiController]
    [Route("[controller]")]
    public class ProdutoController : ControllerBase
    {

        private readonly ILogger<ProdutoController> _logger;
        private readonly IProdutoService _produto;
        public ProdutoController(ILogger<ProdutoController> logger, IProdutoService produto)
        {
            _logger = logger;
            _produto = produto;
        }

        [HttpGet]
        public IActionResult TodosProdutos()
        {
            return Ok(_produto.RetonarListaProduto());
        }

        [HttpGet("{id}")]
        public IActionResult produto(int id)
        {
            return Ok(_produto.RetornarProdutoPorId(id));
        }

        [HttpPost]
        public IActionResult produtoAdd([FromBody] Produto novoProduto)
        {
            return Ok(_produto.AdicionarProduto(novoProduto));
        }

        [HttpPut]
        public IActionResult produtoUpdate([FromBody] Produto novoProduto)
        {
            return Ok(_produto.AtualizarProduto(novoProduto));
        }


        [HttpDelete("{id}")]
        public IActionResult produtoDelete(int id)
        {
            return Ok(_produto.DeletarProduto(id));
        }
    }
}

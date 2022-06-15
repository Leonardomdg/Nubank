package com.nubank.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nubank.nubankclone.adapter.AdapterPagamento
import com.nubank.nubankclone.databinding.ActivityMainBinding
import com.nubank.nubankclone.databinding.PagamentoItemBinding
import com.nubank.nubankclone.model.Pagamento

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconesPagamento = binding.recyclerIconesPagamento
        recyclerIconesPagamento?.let {
            setupRecyclerView(it)
        }

    }

    private fun setupRecyclerView(it: RecyclerView) {
        it.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        it.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        it.adapter = adapterPagamento
        listaIconesPagamento()
    }

    private fun listaIconesPagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix, titulo = "Área Pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode, titulo = "Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo, titulo = "Pegar\n Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.transferencia, titulo = "Transferir")
        listaPagamento.add(icone1)

        val icone5 = Pagamento(R.drawable.depositar, titulo = "Depositar")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_recarga_celular, titulo = "Recarga de celular")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_baseline_monetization_on_24, titulo = "Cobrar")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.doacao, titulo = "Doação")
        listaPagamento.add(icone8)


    }
}
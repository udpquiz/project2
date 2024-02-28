package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast

class allmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allmenu)
        val b1:Button=findViewById(R.id.btn)
        val t1:TextView=findViewById(R.id.txt1)
        registerForContextMenu(t1)
        b1.setOnClickListener {
            val p=PopupMenu(this,b1)
            p.menuInflater.inflate(R.menu.menu1,p.menu)
            p.setOnMenuItemClickListener { menuitem->
                when (menuitem.itemId){
                    R.id.home->             startActivity(Intent(this,seekbar::class.java))
                    R.id.home2->Toast.makeText(this,"You Select HOME2",Toast.LENGTH_SHORT).show()

                }
//                Toast.makeText(this,"You Select"+menuitem.title,Toast.LENGTH_SHORT).show()
                true
            }
            p.show()

        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.menu1,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home2->Toast.makeText(this,"You Select HOME2",Toast.LENGTH_SHORT).show()


        }
        return super.onContextItemSelected(item)
    }
}
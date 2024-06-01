package com.gna.myfoodapp.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.gna.myfoodapp.R
import com.gna.myfoodapp.models.HomeHorModels
import com.gna.myfoodapp.ui.home.HomeFragment

class HomeHorAdapter(
    private val updateVerticalRec: HomeFragment,
    private val activity: FragmentActivity,
    homeHorModelList: ArrayList<HomeHorModels>
) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    private var check = true
    private var select = true
    private var row_index = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_horizontal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    /*
    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val item = ArrayList<HomeVerModel>()[position]


        holder.imageView.setImageResource(item.image)
        holder.name.text = item.name

        if (check) {
            val homeVerModels = ArrayList<HomeVerModel>()
            homeVerModels.add(HomeVerModel(R.drawable.pizza, "Pizza", "35 minute", "4.9", "Min $20"))
            homeVerModels.add(HomeVerModel(R.drawable.pizza2, "Pizza", "35 minute", "4.9", "Min $20"))
            homeVerModels.add(HomeVerModel(R.drawable.pizza3, "Pizza", "35 minute", "4.9", "Min $20"))
            updateVerticalRec.callBack(position, homeVerModels)
            check = false
        }

        holder.cardView.setOnClickListener {
            row_index = position
            notifyDataSetChanged()

            val homeVerModels = ArrayList<HomeVerModel>()
            when (position) {
                0 -> {
                    homeVerModels.add(HomeVerModel(R.drawable.pizza, "Pizza", "35 minute", "4.9", "Min $20"))
                    homeVerModels.add(HomeVerModel(R.drawable.pizza2, "Pizza", "35 minute", "4.9", "Min $20"))
                    homeVerModels.add(HomeVerModel(R.drawable.pizza3, "Pizza", "35 minute", "4.9", "Min $20"))
                }
                1 -> {
                    homeVerModels.add(HomeVerModel(R.drawable.hamburger, "Burger", "1 hour", "4.8", "Min $40"))
                    homeVerModels.add(HomeVerModel(R.drawable.hamburger, "Burger", "1 hour", "4.8", "Min $40"))
                    homeVerModels.add(HomeVerModel(R.drawable.hamburger, "Burger", "1 hour", "4.8", "Min $40"))
                }
                2 -> {
                    homeVerModels.add(HomeVerModel(R.drawable.lasagna, "Lasagne", "2 hour", "5.0", "Min $40"))
                    homeVerModels.add(HomeVerModel(R.drawable.lasagna, "Lasagne", "2 hour", "5.0", "Min $40"))
                    homeVerModels.add(HomeVerModel(R.drawable.lasagna, "Lasagne", "2 hour", "5.0", "Min $40"))
                }
            }
            updateVerticalRec.callBack(position, homeVerModels)
        }


        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg)
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg)
            }
        }
    }

     */

    /*
    override fun getItemCount(): Int {
        return .size
    }
     */



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val imageView: ImageView = itemView.findViewById(R.id.kofte)
        //val name: TextView = itemView.findViewById(R.id.name)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}


/*
class HomeHorAdapter(

    private val updateVerticalRec: UpdateVerticalRec,
    private val activity: Activity,
    private val list: ArrayList<HomeHorModels>
) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_horizontal_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list[position].image)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.pizza_img)
        val name: TextView = itemView.findViewById(R.id.pizzaText)
    }
}

 */





/*
JAVA
public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {


    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    Arraylist<HomeHorModel> list;


    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec,Activity activity, Arraylist<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageSource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

        homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza" , "35 minute" , "4.9", "Min $20"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza" , "35 minute" , "4.9", "Min $20"));
        homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza" , "35 minute" , "4.9", "Min $20"));

        updateVerticalRec.callBack(position, homeVerModels);
        check = false;
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row index = position;
                notifyDataSetChanged();

                if(position == 0) {

                ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza" , "35 minute" , "4.9", "Min $20"));
                homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza" , "35 minute" , "4.9", "Min $20"));
                homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza" , "35 minute" , "4.9", "Min $20"));

                updateVerticalRec.callBack(position, homeVerModels);
                } else if(position == 1) {

                ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                homeVerModels.add(new HomeVerModel(R.drawable.burger, "Burger" , "1 hour" , "4.8", "Min $40"));
                homeVerModels.add(new HomeVerModel(R.drawable.burger, "Burger" , "1 hour" , "4.8", "Min $40"));
                homeVerModels.add(new HomeVerModel(R.drawable.burger, "Burger" , "1 hour" , "4.8", "Min $40"));


                updateVerticalRec.callBack(position, homeVerModels);
                } else if(position == 2) {

                ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                homeVerModels.add(new HomeVerModel(R.drawable.lasagna, "Lasagne" , "2 hour" , "5.0", "Min $40"));
                homeVerModels.add(new HomeVerModel(R.drawable.lasagna, "Lasagne" , "2 hour" , "5.0", "Min $40"));
                homeVerModels.add(new HomeVerModel(R.drawable.lasagna, "Lasagne" , "2 hour" , "5.0", "Min $40"));


                updateVerticalRec.callBack(position, homeVerModels);
                }
            }
      });

      if(select) {
            if(position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            }
      } else {
        if(row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
         } else {
            holder.cardView.setBackgroundResource(R.drawable.default_bg);
         }
      }
}
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.kofte);
            name = itemView.findViewById(R.d.name);
            cardView = itemView.findViewById(R.d.cardView);

       }
    }
}
 */

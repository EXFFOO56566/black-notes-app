.class Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field private u:Landroid/widget/ImageView;

.field private v:Landroid/widget/ImageView;

.field final synthetic w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;


# direct methods
.method public constructor <init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f0800de

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v0, 0x7f0800d8

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->v:Landroid/widget/ImageView;

    new-instance v0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;

    invoke-direct {v0, p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b$a;-><init>(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 4

    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->w:Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;

    invoke-static {v0}, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;->a(Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/a/a/b/c/c;

    invoke-virtual {p1}, Lc/a/a/a/a/b/c/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "purpleLight"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_1
    const-string v1, "green"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_2
    const-string v1, "pink"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    goto :goto_1

    :sswitch_3
    const-string v1, "mint"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_4
    const-string v1, "blue"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_5
    const-string v1, "sky"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_6
    const-string v1, "red"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_7
    const-string v1, "yellow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_1

    :sswitch_8
    const-string v1, "purple"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x9

    goto :goto_1

    :sswitch_9
    const-string v1, "orange"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f3

    goto :goto_2

    :pswitch_1
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f7

    goto :goto_2

    :pswitch_2
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f1

    goto :goto_2

    :pswitch_3
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f2

    goto :goto_2

    :pswitch_4
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f5

    goto :goto_2

    :pswitch_5
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f0

    goto :goto_2

    :pswitch_6
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700ef

    goto :goto_2

    :pswitch_7
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f4

    goto :goto_2

    :pswitch_8
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700ed

    goto :goto_2

    :pswitch_9
    iget-object v0, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->u:Landroid/widget/ImageView;

    const v1, 0x7f0700f6

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_3
    invoke-virtual {p1}, Lc/a/a/a/a/b/c/c;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->v:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_4

    :cond_1
    iget-object p1, p0, Lnotepad/note/notas/notes/notizen/widget/oneByOne/selectColor/b$b;->v:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3c21d9d2 -> :sswitch_9
        -0x3a3af844 -> :sswitch_8
        -0x2bc39b8c -> :sswitch_7
        0x1b891 -> :sswitch_6
        0x1bd21 -> :sswitch_5
        0x2e305a -> :sswitch_4
        0x332462 -> :sswitch_3
        0x348176 -> :sswitch_2
        0x5e0cf03 -> :sswitch_1
        0x4476b2ba -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class Landroidx/appcompat/widget/y$a;
.super La/g/d/c/f$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/y$a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/appcompat/widget/y;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I

.field private final c:I


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/y;II)V
    .locals 1

    invoke-direct {p0}, La/g/d/c/f$a;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/appcompat/widget/y$a;->a:Ljava/lang/ref/WeakReference;

    iput p2, p0, Landroidx/appcompat/widget/y$a;->b:I

    iput p3, p0, Landroidx/appcompat/widget/y$a;->c:I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/y$a;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/y;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_2

    iget v1, p0, Landroidx/appcompat/widget/y$a;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    iget v2, p0, Landroidx/appcompat/widget/y$a;->c:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v1, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    :cond_2
    new-instance v1, Landroidx/appcompat/widget/y$a$a;

    iget-object v2, p0, Landroidx/appcompat/widget/y$a;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0, v2, p1}, Landroidx/appcompat/widget/y$a$a;-><init>(Landroidx/appcompat/widget/y$a;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/y;->a(Ljava/lang/Runnable;)V

    return-void
.end method

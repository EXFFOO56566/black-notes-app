.class final Lb/c/b/a/e/f/n;
.super Lb/c/b/a/e/f/i0$a;
.source ""


# instance fields
.field private final synthetic f:I

.field private final synthetic g:Ljava/lang/String;

.field private final synthetic h:Ljava/lang/Object;

.field private final synthetic i:Ljava/lang/Object;

.field private final synthetic j:Ljava/lang/Object;

.field private final synthetic k:Lb/c/b/a/e/f/i0;


# direct methods
.method constructor <init>(Lb/c/b/a/e/f/i0;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lb/c/b/a/e/f/n;->k:Lb/c/b/a/e/f/i0;

    const/4 p2, 0x5

    iput p2, p0, Lb/c/b/a/e/f/n;->f:I

    iput-object p4, p0, Lb/c/b/a/e/f/n;->g:Ljava/lang/String;

    iput-object p5, p0, Lb/c/b/a/e/f/n;->h:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, p0, Lb/c/b/a/e/f/n;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb/c/b/a/e/f/n;->j:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lb/c/b/a/e/f/i0$a;-><init>(Lb/c/b/a/e/f/i0;Z)V

    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    iget-object v0, p0, Lb/c/b/a/e/f/n;->k:Lb/c/b/a/e/f/i0;

    invoke-static {v0}, Lb/c/b/a/e/f/i0;->c(Lb/c/b/a/e/f/i0;)Lb/c/b/a/e/f/d0;

    move-result-object v1

    iget v2, p0, Lb/c/b/a/e/f/n;->f:I

    iget-object v3, p0, Lb/c/b/a/e/f/n;->g:Ljava/lang/String;

    iget-object v0, p0, Lb/c/b/a/e/f/n;->h:Ljava/lang/Object;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v4

    iget-object v0, p0, Lb/c/b/a/e/f/n;->i:Ljava/lang/Object;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v5

    iget-object v0, p0, Lb/c/b/a/e/f/n;->j:Ljava/lang/Object;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lb/c/b/a/e/f/d0;->a(ILjava/lang/String;Lb/c/b/a/d/a;Lb/c/b/a/d/a;Lb/c/b/a/d/a;)V

    return-void
.end method

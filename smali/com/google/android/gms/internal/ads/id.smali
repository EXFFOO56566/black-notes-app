.class final Lcom/google/android/gms/internal/ads/id;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/gd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/id;->b:Lcom/google/android/gms/internal/ads/gd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/id;->b:Lcom/google/android/gms/internal/ads/gd;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    return-void
.end method

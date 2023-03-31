.class final Lcom/google/android/gms/internal/ads/od;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/md;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/md;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/od;->b:Lcom/google/android/gms/internal/ads/md;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/od;->b:Lcom/google/android/gms/internal/ads/md;

    const-string p2, "User canceled the download."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/wd;->a(Ljava/lang/String;)V

    return-void
.end method
